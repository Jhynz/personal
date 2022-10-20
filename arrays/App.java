public class App {
    public static void main(String[] args) throws Exception {
        
        char[][] alphabet = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}};

        for (int rows = 0; rows < 3; rows++){
            System.out.println("");
            for (int columns = 0; columns < 3; columns++){
                System.out.print(alphabet[rows][columns]);
        };
    }
        // System.out.println(alphabet[1][1]);
        // System.out.println(alphabet[2][0]);
        // System.out.println(alphabet[0][1]);

        // for (int hours = 0; hours < 12; hours++) {
        //     for (int minutes = 0; minutes < 60; minutes++)
        //         for (int seconds = 0; seconds < 60; seconds++)

        //         System.out.println(hours + ":" + minutes + ":" + seconds);

        // }
    }
}
