package org.example.service;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IDateSorterImplTest {

    private IDateSorter iDateSorter = new IDateSorterImpl();

    private List<LocalDate> unsortedDateList;

    @Before
    public void setUp() {

        unsortedDateList = List.of(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 5, 3)
        );

    }

    @Test
    public void sortDates() {

        Collection<LocalDate> expectedDatesCollection = List.of(
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 5, 3)
        );

        Collection<LocalDate> actualDatesCollection = iDateSorter.sortDates(unsortedDateList);

        assertEquals(expectedDatesCollection.size(), actualDatesCollection.size());
        assertEquals(expectedDatesCollection.toString(), actualDatesCollection.toString());

    }
}