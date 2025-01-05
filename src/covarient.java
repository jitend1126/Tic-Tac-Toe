    class parent {
        Number getValue() {
            return 1;
        }
    }

    class Child extends parent {
        @Override
        Number getValue() { // Covariant return type
            return 10.00;// ;
        }
    }

    public class covarient {
        public static void main(String[] args) {
            parent parent = new Child();
            System.out.println(parent.getValue().hashCode()); // Output: 42   455659002

        }
    }


