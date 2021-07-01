enum EnumExampleJa {
    A(1) {
        @Override int getEnumValueX2() {
            return 2;
        }
    },
    B(2) {
        @Override int getEnumValueX2() {
            return 4;
        }
    };

    final int value;

    EnumExampleJa(int value) {
        this.value = value;
    }

    int getEnumValue() {
        return value;
    }

    abstract int getEnumValueX2();
}