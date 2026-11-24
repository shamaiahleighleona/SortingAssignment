public class Sorting {
    public static void main(String[] args) {

        String[] Mybooks = {"A Room of One's Own by Virgina Woolf", "The Stranger by Albert Camus", "Animal Farm by George Orwell", "We Have Always Lived iIn This Castle by Shirley Jackson"};
        int[] totalPages = {112, 123, 93, 146};

        System.out.println("Sham's To-Read List (under 200 pages ver.): ");

        for (int a = 0; a < Mybooks.length; a++) {
            System.out.println(Mybooks[a] + " - " + totalPages[a] + " pages");
        }

        for (int a = 0; a < totalPages.length - 1; a++) {
            for (int b = 0; b < totalPages.length - 1 - a; b++) {

                if (totalPages[b] > totalPages[b + 1]) {

                    int temp = totalPages[b];
                    totalPages[b] = totalPages[b + 1];
                    totalPages[b + 1] = temp;

                    String temp2 = Mybooks[b];
                    Mybooks[b] = Mybooks[b + 1];
                    Mybooks[b + 1] = temp2;

                }
            }
        }

        System.out.println("\nSham's To-Read Priority List: ");
        for (int a = 0; a < Mybooks.length; a++) {
            System.out.println(Mybooks[a] + " - " + totalPages[a] + " pages");
        }

    }
}
