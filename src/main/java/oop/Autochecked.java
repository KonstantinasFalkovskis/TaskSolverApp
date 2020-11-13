package oop;

public interface Autochecked {

    default boolean taskAutochecking(int number) {
        boolean isAutocheck = false;
        if (number % 2 == 0) {
            isAutocheck = true;
        } else {
            isAutocheck = false;
        }
        return isAutocheck;
    }


}
