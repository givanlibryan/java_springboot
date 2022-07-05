public class MainTes {
    @Test
    void testThreadHello() {
        System.out.println("----------");
        for (int i = 0; i < 10; i++) {
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
        }
    }

    @Test
    void testThreadWorld() {
        System.out.println("----------");
        for (int i = 0; i < 10; i++) {
            int tes = i * i * i;
            ThreadWorld instance = new ThreadWorld(String.valueOf(tes));
            Thread t = new Thread(instance);
            t.start();
        }
    }

    @Test
    void testThreadNumber() {
        System.out.println("----------");
        NumberGenerator generator = new NumberGenerator(1000, 2000);
        for (int i = 0; i < 3; i++) {
            new ThreadNumber(generator).start();
        }
    }
}
