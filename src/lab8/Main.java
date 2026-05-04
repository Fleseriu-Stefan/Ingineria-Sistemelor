package lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Main {

    public static void main(String[] args) {
        readExcel("laborator8_input.xlsx");
        createOutputWithAverage("laborator8_input.xlsx", "laborator8_output2.xlsx");
        createOutputWithFormula("laborator8_input.xlsx", "laborator8_output3.xlsx");
    }

    public static void readExcel(String fileName) {

        try (FileInputStream fis = new FileInputStream(fileName);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            System.out.println("8.5.1 Continut fisier Excel:\n");

            for (Row row : sheet) {

                for (Cell cell : row) {

                    switch (cell.getCellType()) {

                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;

                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;

                        default:
                            System.out.print("\t");
                    }
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createOutputWithAverage(String inputFile, String outputFile) {

        try (FileInputStream fis = new FileInputStream(inputFile);
             Workbook inputWorkbook = new XSSFWorkbook(fis);
             Workbook outputWorkbook = new XSSFWorkbook()) {

            Sheet inputSheet = inputWorkbook.getSheetAt(0);
            Sheet outputSheet = outputWorkbook.createSheet("Output");

            for (Row inputRow : inputSheet) {

                Row outputRow = outputSheet.createRow(inputRow.getRowNum());

                int lastCell = inputRow.getLastCellNum();

                for (int i = 0; i < lastCell; i++) {

                    Cell inputCell = inputRow.getCell(i);
                    Cell outputCell = outputRow.createCell(i);

                    if (inputCell == null) continue;

                    if (inputCell.getCellType() == CellType.STRING) {
                        outputCell.setCellValue(inputCell.getStringCellValue());
                    } else if (inputCell.getCellType() == CellType.NUMERIC) {
                        outputCell.setCellValue(inputCell.getNumericCellValue());
                    }
                }

                Cell avgCell = outputRow.createCell(lastCell);

                if (inputRow.getRowNum() == 0) {
                    avgCell.setCellValue("Media");
                } else {

                    double n1 = inputRow.getCell(lastCell - 3).getNumericCellValue();
                    double n2 = inputRow.getCell(lastCell - 2).getNumericCellValue();
                    double n3 = inputRow.getCell(lastCell - 1).getNumericCellValue();

                    double media = (n1 + n2 + n3) / 3.0;

                    avgCell.setCellValue(media);
                }
            }

            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                outputWorkbook.write(fos);
            }

            System.out.println("\n8.5.2 Fisier creat: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createOutputWithFormula(String inputFile, String outputFile) {

        try (FileInputStream fis = new FileInputStream(inputFile);
             Workbook inputWorkbook = new XSSFWorkbook(fis);
             Workbook outputWorkbook = new XSSFWorkbook()) {

            Sheet inputSheet = inputWorkbook.getSheetAt(0);
            Sheet outputSheet = outputWorkbook.createSheet("Output3");

            for (Row inputRow : inputSheet) {

                Row outputRow = outputSheet.createRow(inputRow.getRowNum());

                int lastCell = inputRow.getLastCellNum();

                for (int i = 0; i < lastCell; i++) {

                    Cell inputCell = inputRow.getCell(i);
                    Cell outputCell = outputRow.createCell(i);

                    if (inputCell == null) continue;

                    if (inputCell.getCellType() == CellType.STRING) {
                        outputCell.setCellValue(inputCell.getStringCellValue());
                    } else if (inputCell.getCellType() == CellType.NUMERIC) {
                        outputCell.setCellValue(inputCell.getNumericCellValue());
                    }
                }

                Cell avgCell = outputRow.createCell(lastCell);

                if (inputRow.getRowNum() == 0) {
                    avgCell.setCellValue("Media formula");
                } else {

                    int excelRow = inputRow.getRowNum() + 1;

                    avgCell.setCellFormula("AVERAGE(D" + excelRow + ":F" + excelRow + ")");
                }
            }

            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                outputWorkbook.write(fos);
            }

            System.out.println("\n8.5.3 Fisier creat: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}