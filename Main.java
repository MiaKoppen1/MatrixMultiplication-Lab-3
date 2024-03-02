
public class Main
    {
    public static void main(String[] args)
        {
        Matrix matrix1 = new Matrix(3, 3);// created an instance/object of the Matrix class.
        Matrix matrix2 = new Matrix(3, 3);// same as above.

        matrix1.InitializeWithRandomValues();// initializing the matrices with random numbers ranging from 1-20.
        matrix2.InitializeWithRandomValues();

        System.out.println("Matrix 1:");// prints the first matrix to the screen.
        matrix1.PrintMatrix();

        System.out.println(" ");// creating space between the two matrices.

        System.out.println("Matrix 2:");// prints the second matrix to the screen.
        matrix2.PrintMatrix();
            try 
                {
                System.out.println("  ");
                System.out.println("Adding Matrices:...");
                Matrix sum = matrix1.AddMatrices(matrix2); // Assuming addMatrices now returns a Matrix
                sum.PrintMatrix();
                } 
                catch (Exception e) 
                    {
                    System.out.println(e.getMessage());
                    }
            
                    // Multiply matrices
                    try 
                        {
                        System.out.println("  ");
                        System.out.println("Multiplying Matrices:....");
                        Matrix product = matrix1.MultiplyMatrices(matrix2); // Assuming multiplyMatrices now returns a Matrix
                        product.PrintMatrix();
                        } 
                    catch (Exception e) 
                        {
                        System.out.println(e.getMessage());
                        }
                    }
                }
            
    