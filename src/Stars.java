public class Stars {
        public static void main(String[] args) {
            st1();
            st2();
            st3();
            st4();
            st5();
            st6();
            st7();
        }

        public static void st1() {
            int s = 10;
            for (int i = 0; i <= s; i++) {
                String emp = "";
                for (int j = 0; j <= s; j++) {
                    if (i >= j) {
                        emp += "";
                    } else {
                        emp += "* ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st2() {
            int s = 10;
            for (int i = 0; i <= s; i++) {
                String emp = "";
                for (int j = 0; j <= s; j++) {
                    if (i <= j) {
                        emp += "";
                    } else {
                        emp += "* ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st3() {
            int p = 10;
            for (int i = 0; i < p; i++) {
                String emp = "";
                for (int j = 0; j < p; j++) {
                    if (i == j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st4() {
            int p = 10;
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 0; j < p; j++) {
                    if (i == j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st5() {
            int p = 10;
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 0; j <= p; j++) {
                    if (i <= j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st6() {
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 10; j >= 0; j--) {
                    if (i >= j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st7() {
            int p = 10;
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
        }
    }