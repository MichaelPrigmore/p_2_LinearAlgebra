

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Domain_Logic.Matrix_Manager;
import Domain_Logic.Reduced_Echelon_Calculator;
import Domain_Logic.pivot_Indicies;

class Tests_For_Linear_Algebra_Project
{

	@Test
	void test_3_by_3_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1 },
				{ 0, 1, 2 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_false_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1 },
				{ 1, 1, 2 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertFalse(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_true_02()
	{
		double[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1 },
				{ 0, 1, 2 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_true_03()
	{
		double[][] matrix =
		{
				{ 0, 0, 0 },
				{ 4, 5, 6 },
				{ 0, 0, 0 } };

		double[][] expected_Output =
		{
				{ 1, 1.25, 1.5 },
				{ 0, 0, 0 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_true_04()
	{
		double[][] matrix =
		{
				{ -1, -2, -3 },
				{ -4, -5, -6 },
				{ -7, -8, -9 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1 },
				{ 0, 1, 2 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_true_05()
	{
		double[][] matrix =
		{
				{ 0, 9, -3 },
				{ 72, 9, 9 },
				{ 2, 7, -13 } };

		double[][] expected_Output =
		{
				{ 1, 0, 0 },
				{ 0, 1, 0 },
				{ 0, 0, 1 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_3_matrix_assert_true_all_zeros()
	{
		double[][] matrix =
		{
				{ 0, 0, 0 },
				{ 0, 0, 0 },
				{ 0, 0, 0 } };

		double[][] expected_Output =
		{
				{ 0, 0, 0 },
				{ 0, 0, 0 },
				{ 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_4_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1, -2 },
				{ 0, 1, 2, 3 },
				{ 0, 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_4_matrix_assert_true_02()
	{
		double[][] matrix =
		{
				{ 0, 0, 0, 0 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1, -2 },
				{ 0, 1, 2, 3 },
				{ 0, 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_4_matrix_assert_true_03()
	{

		double[][] matrix =
		{
				{ 15, 2, 3, 4 },
				{ 5, 9, 7, 8 },
				{ 9, 10, 16, 12 } };

		double[][] expected_Output =
		{
				{ 1, 0, 0, .126 },
				{ 0, 1, 0, .566 },
				{ 0, 0, 1, .326 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output, .001));

	}

	@Test
	void test_pivot_Indicies_first_constructor()
	{
		pivot_Indicies ind = new pivot_Indicies();

		ind.setRow_Pivot_Index(1);
		ind.setColumn_Pivot_Index(2);

		assertEquals(ind.getRow_Pivot_Index(), 1);
		assertEquals(ind.getColumn_Pivot_Index(), 2);

	}

	@Test
	void test_pivot_Indicies_second_constructor()
	{
		pivot_Indicies ind = new pivot_Indicies(1, 2);

		assertEquals(ind.getRow_Pivot_Index(), 1);
		assertEquals(ind.getColumn_Pivot_Index(), 2);

	}

	@Test
	void test_Matrix_Manager_first_constructor()
	{
		Matrix_Manager manager = new Matrix_Manager();

		manager.set_Value_At_Index(0, 0, 1);
		manager.set_Value_At_Index(0, 1, 2);
		manager.set_Value_At_Index(1, 0, 3);
		manager.set_Value_At_Index(1, 1, 4);

		double[][] matrix =
		{
				{ 1, 2 },
				{ 3, 4 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);

		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, manager.get_My_Matrix()));

	}

	@Test
	void test_Matrix_Manager_first_second_set_rows_and_columns()
	{
		Matrix_Manager manager = new Matrix_Manager(3, 3);

		manager.set_Rows_And_Columns(2, 2);

		manager.set_Value_At_Index(0, 0, 1);
		manager.set_Value_At_Index(0, 1, 2);
		manager.set_Value_At_Index(1, 0, 3);
		manager.set_Value_At_Index(1, 1, 4);

		double[][] matrix =
		{
				{ 1, 2 },
				{ 3, 4 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);

		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, manager.get_My_Matrix()));

	}

	@Test
	void test_Matrix_Manager_second_constructor()
	{
		Matrix_Manager manager = new Matrix_Manager(3, 3);

		double[][] matrix =
		{
				{ 1, 2 },
				{ 3, 4 } };

		double[][] matrix2 =
		{
				{ 1, 2 },
				{ 3, 4 } };

		manager.setMy_Matrix(matrix2);

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);

		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, manager.get_My_Matrix()));

	}

}
