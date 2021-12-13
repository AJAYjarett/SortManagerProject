package sorters;

public class SorterFactory {

    public static Sorter getSorter(String sorterType){
        if (sorterType == null) return null;
        if (sorterType == "1") return new BubbleSorter();

        return null;
    }

}
