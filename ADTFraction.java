
class ADTFraction {
    private int n; // numerator
    private int d; // demorator

    public ADTFraction() {
        this.d = 1;
        this.n = 0;
    }

    public ADTFraction(int a, int b) {
        if (b != 0) {
            this.d = b;
            this.n = a;
        } else {
            System.out.println("Elumenator cannot be zero");
        }
    }

    public void set(int a, int b) {
        if (b != 0) {
            this.d = b;
            this.n = a;
        } else {
            System.out.println("Elumenator cannot be zero");
        }
    }

    public void display() {
        System.out.println("n/d=" + "/" + d);
    }

    public ADTFraction plus(ADTFraction x) {
        ADTFraction r = new ADTFraction((this.n * x.d) + (x.n * this.d), (this.d * x.d));
        return r;
    }

    public ADTFraction times(ADTFraction x) {
        ADTFraction r = new ADTFraction((this.n * x.n), (this.d * x.d));
        return r;
    }

}

class Main {
    public static void main(String[] args) {
        ADTFraction t = new ADTFraction(3, 2);
        ADTFraction b = new ADTFraction(3, 4);
        ADTFraction m = t.plus(t);
        m.display();

    }
}
