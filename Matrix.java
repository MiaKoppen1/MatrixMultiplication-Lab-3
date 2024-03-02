

public class Matrix 
    {
    private int rows;
    private int columns;
    private int[][] MyMatrix;

    public Matrix(int rows, int columns)// constructor for the matrix, so we can create object/instances.
        {
        this.rows = rows;
        this.columns = columns;
        this.MyMatrix = new int[rows][columns];
        }
    public void PrintMatrix()// method to print the matrices to the screen.
        {
        for (int i = 0; i < rows; i++)
            {
            for (int j = 0; j < columns; j++)
                {
                System.out.print(MyMatrix[i][j] + " ");
                }
            System.out.println();
            }
        }

    public void SetElement(int row, int column, int value)// Set the value of a specific element
        {
        MyMatrix[row][column] = value;
        }

    public int GetElement(int row, int column)    // Get the value of a specific element
        {
        return MyMatrix[row][column];
        }

    public Matrix AddMatrices(Matrix otherMatrix)// method created to add the two matrices.
        {
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) 
            {
            for (int j = 0; j < this.columns; j++) 
                {
                result.SetElement(i, j, this.GetElement(i, j) + otherMatrix.GetElement(i, j));
                }
            }
        return result;
        }

    public Matrix MultiplyMatrices(Matrix otherMatrix)// method created to multiply the matrices.
        {
        if (this.columns != otherMatrix.rows) 
            {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
            }
        Matrix result = new Matrix(this.rows, otherMatrix.columns);
        for (int i = 0; i < this.rows; i++) 
            {
            for (int j = 0; j < otherMatrix.columns; j++) 
                {
                for (int k = 0; k < this.columns; k++) 
                    {
                    result.MyMatrix[i][j] += this.MyMatrix[i][k] * otherMatrix.MyMatrix[k][j];
                    }
                }
            }
        return result;
        }

    
    public int GetRows()// getter for rows
        {
        return this.rows;
        }

    public int GetColumns()// getter for columns
        {
        return this.columns;
        }

        public void InitializeWithRandomValues()// method to initialize the matrices with random values ranging from 1-20.
            {
            for (int i = 0; i < this.rows; i++) 
                {
                for (int j = 0; j < this.columns; j++) 
                    {
                    // Assign each element a random value between 1 and 10
                    this.MyMatrix[i][j] = (int) (Math.random() * 20) + 1;
                    }
                }
            }
         }
        
    