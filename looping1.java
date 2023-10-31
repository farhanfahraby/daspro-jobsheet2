public class looping1 {
    public static void main(String[] args) {
        

        // while (kondisi) {
        //    aksi
        //    }

        int a = 0;
            boolean kondisi = true;
            System.out.println("awal program");
            
            while (kondisi) {
                System.out.println(" kondisi program awal " + a + a);
                
                if (a == 10) {
                    kondisi = false;
                }
                a++;
            }
            System.out.println("akhir program");
    }
}
