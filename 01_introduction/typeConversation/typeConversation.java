class typeConversation {
    public static void main(String[] args) {
        byte a = 4;
        int b = a;
        System.out.println(b);
        int d = 20000;
        byte e = (byte)d;
        System.out.println(e);

        float f = 2.3f;
        int g = (int)f;
        System.out.println(g);

        byte h = 31;
        h = (byte) (h * 2);
        System.out.println(h);

        int i = 'A';
        System.out.println(i);
    }
}
