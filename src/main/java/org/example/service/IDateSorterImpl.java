package org.example.service;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class IDateSorterImpl implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> datesListWithR = unsortedDates.stream()
                .filter(date -> date.getMonth().toString().toLowerCase().contains("r"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());


        List<LocalDate> datesListWithoutR = unsortedDates.stream()
                .filter(date -> !(date.getMonth().toString().toLowerCase().contains("r")))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Collection<LocalDate> sortedDates = new ArrayList<>();

        sortedDates.addAll(datesListWithR);
        sortedDates.addAll(datesListWithoutR);

        return sortedDates;
    }
}
