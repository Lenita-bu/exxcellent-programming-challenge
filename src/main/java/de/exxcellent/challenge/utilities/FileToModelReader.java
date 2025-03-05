package de.exxcellent.challenge.utilities;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class FileToModelReader {
    public static <E> List<E> readCsvData(String fileName, Class<E> dataClass) throws FileNotFoundException {
        Reader reader = new BufferedReader(new FileReader("src/main/resources/de/exxcellent/challenge/"+fileName));
        CsvToBean<E> csvReader = new CsvToBeanBuilder<E>(reader)
                .withType(dataClass)
                .withSeparator(',')
                .build();
        return csvReader.parse();
    }
}
