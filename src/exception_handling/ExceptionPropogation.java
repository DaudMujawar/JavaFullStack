package exception_handling;

public class ExceptionPropogation {


        public static void main(String[] args) {
            exception_handling.ExceptionPropogation exceptionPropogation = new exception_handling.ExceptionPropogation();
            exceptionPropogation.c();
        }

        private void a() {
            int i = 1;
            int j = i / 0;
        }

        private void b() {
            a();
        }

        private void c() {
            try {
                this.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
