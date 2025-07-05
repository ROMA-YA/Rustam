package l14;

public class Enymm {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println("============");

        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (JavarushQuest printes: javarushQuests){
            System.out.println(printes);
        }
        System.out.println("============");

        JavarushQuest[] javarushQuests1 = JavarushQuest.values();
        for (JavarushQuest printes1: javarushQuests1){
            System.out.println(printes1.ordinal());
        }
        System.out.println("============");

        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));


    }

    public static Month getNextMonth(Month month){
        Month[] months = Month.values();
        int nextIndex = (month.ordinal() +1) % months.length;
        return months[nextIndex];
    }

    public enum Season{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }

    public enum JavarushQuest {
        JAVA_SYNTAX,
        JAVA_CORE,
        JAVA_MULTITHREADING,
        JAVA_COLLECTIONS,
        CS_50,
        ANDROID,
        GAMES
    }

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}
