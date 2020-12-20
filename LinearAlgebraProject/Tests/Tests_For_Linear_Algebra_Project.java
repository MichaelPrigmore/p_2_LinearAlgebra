
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Domain_Logic.Matrix_Manager;
import Domain_Logic.Reduced_Echelon_Calculator;
import Domain_Logic.pivot_Indicies;
import Domain_Logic.Reduced_Echelon_Calculator.Sign;

class Tests_For_Linear_Algebra_Project
{

	@Test
	void test_2_by_2_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, },
				{ 1, 2, } };

		double[][] expected_Output =
		{
				{ 1, 2, },
				{ 0, 0, } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_2_by_2_matrix_assert_true_02()
	{
		double[][] matrix =
		{
				{ 1, 200, },
				{ 1, 2, } };

		double[][] expected_Output =
		{
				{ 1, 0, },
				{ 0, 1, } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_2_by_2_matrix_assert_true_03()
	{
		double[][] matrix =
		{
				{ 15462, 789512, },
				{ 77845, 47474747, } };

		double[][] expected_Output =
		{
				{ 1, 0, },
				{ 0, 1, } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_2_by_2_matrix_assert_true_04()
	{
		double[][] matrix =
		{
				{ 15.462, 7895.12, },
				{ 7.7845, 4747.4747, } };

		double[][] expected_Output =
		{
				{ 1, 0, },
				{ 0, 1, } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_2_by_3_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1 },
				{ 0, 1, 2 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_2_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 } };

		double[][] expected_Output =
		{
				{ 1, 0 },
				{ 0, 1 },
				{ 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_6_by_2_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 0, 0 },
				{ 0, 0 },
				{ 5, 6 },
				{ 1, 2 },
				{ 0, 0 },
				{ 5, 6 } };

		double[][] expected_Output =
		{
				{ 1, 0 },
				{ 0, 1 },
				{ 0, 0 },
				{ 0, 0 },
				{ 0, 0 },
				{ 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_6_by_2_matrix_assert_true_02()
	{
		double[][] matrix =
		{
				{ -50, 24 },
				{ 49, 22 },
				{ -37.54, 700 },
				{ 47, 47 },
				{ 8, 8 },
				{ 5, 6 } };

		double[][] expected_Output =
		{
				{ 1, 0 },
				{ 0, 1 },
				{ 0, 0 },
				{ 0, 0 },
				{ 0, 0 },
				{ 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

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
	void test_4_by_5_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1, -2, -3 },
				{ 0, 1, 2, 3, 4 },
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_3_by_5_matrix_assert_true_no_solutions_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 1, 1, 8 },
				{ 1, 2, 2, -1, 12 },
				{ 2, 4, 0, 6, 4 } };

		double[][] expected_Output =
		{
				{ 1, 2, 0, 3, 0 },
				{ 0, 0, 1, -2, 0 },
				{ 0, 0, 0, 0, 1 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_4_by_5_matrix_assert_true_02_no_solutions()
	{
		double[][] matrix =
		{
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 11 },
				{ 12, 13, 14, 15, 16 },
				{ 17, 18, 19, 20, 21 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1, -2, 0 },
				{ 0, 1, 2, 3, 0 },
				{ 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0 } };

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
	void test_6_by_6_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };

		double[][] expected_Output =
		{
				{ 1, 0, -1, -2, -3, -4 },
				{ 0, 1, 2, 3, 4, 5 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_6_by_6_matrix_assert_true_02()
	{
		double[][] matrix =
		{
				{ 0, 516, 754, 98, 12, 987 },
				{ -.005, 4, 5, -7, 95.4, 333 },
				{ 5, 87, 44, 9.87, 78, -74 },
				{ 279, -55, 47, 64, 8319, 7 },
				{ 416, 711, -874, .548, 74, 9 },
				{ .008, 751, 49715, -3, 43.874, 9 } };

		double[][] expected_Output =
		{
				{ 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_6_by_4_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 0, 516, 754, 98 },
				{ -.005, 4, 5, -7 },
				{ 5, 87, 44, 9.87 },
				{ 279, -55, 47, 64 },
				{ 416, 711, -874, .548 },
				{ .008, 751, 49715, -3 } };

		double[][] expected_Output =
		{
				{ 1, 0, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output));

	}

	@Test
	void test_4_by_6_matrix_assert_true_01()
	{
		double[][] matrix =
		{
				{ 0, 516, 754, 98, 12, 987 },
				{ -.005, 4, 5, -7, 95.4, 333 },
				{ 5, 87, 44, 9.87, 78, -74 },
				{ 279, -55, 47, 64, 8319, 7 } };

		double[][] expected_Output =
		{
				{ 1, 0, 0, 0, 32.238, 8.672 },
				{ 0, 1, 0, 0, -.5608, .0387 },
				{ 0, 0, 1, 0, 2.0274, 6.8294 },
				{ 0, 0, 0, 1, -12.5239, -42.6773 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output, .0001));

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

	@Test
	void test_enumerator_zero()
	{

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(2, 2);

		assertEquals(calculator.get_sign(0), Sign.ZERO);

	}

	@Test
	void test_3_by_3_matrix_assert_true_with_matrix_manager()
	{
		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(2, 2);
		Matrix_Manager manager = new Matrix_Manager();

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

		manager.setMy_Matrix(matrix);

		calculator.setManager(manager);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertTrue(calculator.these_Two_Matricies_Are_equal(calculator.getManager().get_My_Matrix(), expected_Output));

	}

	@Test
	void test_nums_are_equal_true_01()
	{
		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(2, 2);

		assertTrue(calculator.numbers_Are_Equal(1.0, 1.0, .000001));

	}

	@Test
	void test_nums_are_equal_false_01()
	{
		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(2, 2);

		assertFalse(calculator.numbers_Are_Equal(1.00001, 1.0, .000001));

	}

	@Test
	void test_3_by_4_matrix_assert_false_01()
	{

		double[][] matrix =
		{
				{ 15, 2, 3, 4 },
				{ 5, 9, 7, 8 },
				{ 9, 10, 16, 12 } };

		double[][] expected_Output =
		{
				{ 100, 0, 0, .126 },
				{ 0, 1, 0, .566 },
				{ 0, 0, 1, .326 } };

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);
		matrix = calculator.computeEchelonForm();
		matrix = calculator.computeReducedEchelonForm();
		assertFalse(calculator.these_Two_Matricies_Are_equal(matrix, expected_Output, .001));

	}

}
