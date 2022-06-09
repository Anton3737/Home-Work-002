public class HomeWork2 {
    public static void main(String[] args) {
        // Домашнє заняття №2 завдання 2

        //Число Pi
        float pi = 3.141592653f;
        // Число Ейлера
        double e = 2.7182818284590452;


        // System.out.println( ); - вивод в консоль перемінних pi / e "Ейлера"
        System.out.println(pi);
        System.out.println(e);

        // Домашнє завдання №2 завданян 3

        // \n перенос рядка в консолі на 1 рядок в низ
        String A = "\nмоя строка 1";

        // \t виконується табуляція рядка при виведенні в консолі
        String B = "\tмоя строка 2";

        // \a не працює на Java 11 (вставлено \\(додоає'\' в консоль) для збереження сенсу)
        String C = "\\a моя строка 3";

        // прогон рядка (в даному випадку виступає як відступ від лівого краю +1)
        String D = "\fмоя строка 4";

        //повернення рядка (в даному прикладі не відображено)
        String E = "\rмоя строка 5";

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);


        String SS = "\n";
        System.out.println(SS);

        // Додатове завдання Используя IntelliJ IDEA, создайте проект. Создайте необходимое
        // количество переменных типа char, каждой переменной присвойте значение одного символа
        // в формате UNICODE. Выведите в консоль фразу «Здравствуйте, ВАШЕ_ИМЯ !».

        char letZ = 'З';
        char letD = 'д';
        char letR = 'р';
        char letA = 'а';
        char letV = 'в';
        char letS = 'с';
        char letT = 'т';
        char let$V = 'в';
        char letU = 'у';
        char letJ = 'й';
        char let$T = 'т';
        char letE = 'е';
        char letDOT = ',';
        char let$A = 'А';
        char letN = 'н';
        char let_T = 'т';
        char letO = 'о';
        char let$N = 'н';
        char let$ = '!';

        System.out.print(letZ);
        System.out.print(letD);
        System.out.print(letR);
        System.out.print(letA);
        System.out.print(letV);
        System.out.print(letS);
        System.out.print(letT);
        System.out.print(let$V);
        System.out.print(letU);
        System.out.print(letJ);
        System.out.print(let$T);
        System.out.print(letE);
        System.out.print(letDOT);
        System.out.print(let$A);
        System.out.print(letN);
        System.out.print(let_T);
        System.out.print(letO);
        System.out.print(let$N);
        System.out.print(let$);

        String SA = "\n";
        System.out.println(SA);

        char[] letters = new char[19];  // спроба через масив

        letters[0] = 'З';
        letters[1] = 'д';
        letters[2] = 'р';
        letters[3] = 'а';
        letters[4] = 'в';
        letters[5] = 'с';
        letters[6] = 'т';
        letters[7] = 'в';
        letters[8] = 'у';
        letters[9] = 'й';
        letters[10] = 'т';
        letters[11] = 'е';
        letters[12] = ',';
        letters[13] = ' ';
        letters[14] = 'A';
        letters[15] = 'N';
        letters[16] = 'T';
        letters[17] = 'O';
        letters[18] = 'N';

        // i++ - інкримент, збульшує лічильник на одиницю
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
    }
}

