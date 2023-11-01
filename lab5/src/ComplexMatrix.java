import java.util.Random;

public class ComplexMatrix {
    public Complex[][] matrix;
    public int height;
    public int width;

    ComplexMatrix(int height, int width) {
        this.height = height;
        this.width = width;
        this.matrix = new Complex[height][width];
    }

    public ComplexMatrix add(ComplexMatrix second) {
        ComplexMatrix result = new ComplexMatrix(this.height, this.width);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                result.matrix[i][j] = this.matrix[i][j].add(second.matrix[i][j]);
            }
        }

        return result;
    }

    public ComplexMatrix substract(ComplexMatrix second) {
        ComplexMatrix result = new ComplexMatrix(this.height, this.width);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                result.matrix[i][j] = this.matrix[i][j].substract(second.matrix[i][j]);
            }
        }

        return result;
    }

    public ComplexMatrix multiplyScalar(int scalar) {
        ComplexMatrix result = new ComplexMatrix(this.height, this.width);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                result.matrix[i][j] = this.matrix[i][j].multiplyScalar(scalar);
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            for (Complex z : this.matrix[i]) {
                System.out.print(z.toString() + ", ");
            }
            System.out.println();
        }
    }
}
