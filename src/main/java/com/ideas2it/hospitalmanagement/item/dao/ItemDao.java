package com.ideas2it.hospitalmanagement.item.dao;

import java.util.Date;
import java.util.List;
import com.ideas2it.hospitalmanagement.diagnosis.model.Diagnosis;
import com.ideas2it.hospitalmanagement.exception.ApplicationException;
import com.ideas2it.hospitalmanagement.item.model.Item;;

public interface ItemDao {

	/**
	 * <p>
	 * This Method is used to add the diagnosis details given by the user and adds
	 * them to the Database. It returns true if the entry is added successfully,
	 * else returns false.
	 * </p>
	 *
	 * @param diagnosis
	 *            an Diagnosis object consisting of the details of the new diagnosis
	 *            provided by the user.
	 * 
	 * @return Boolean a boolean indicating the id of the Diagnosis that is
	 *         inserted.
	 *
	 * @throws ApplicationException
	 *             An exception created for catching exceptions that occur while
	 *             adding an diagnosis.
	 */
	public boolean insertItem(Item item) throws ApplicationException;

	/**
	 * <p>
	 * This Method is used to obtain an arraylist of all the diagnosis that are
	 * currently present.
	 * </p>
	 *
	 * @return diagnosis an Arraylist consisting of all the diagnosis is returned.
	 *
	 * @throws ApplicationException
	 *             An exception created for catching exceptions that occur while
	 *             displaying all diagnosis.
	 */
	public List<Item> fetchAllItems() throws ApplicationException;;

	/**
	 * <p>
	 * This Method is used to update the details of an Diagnosis. Returns true if
	 * the entry is modified, else returns false.
	 * <p>
	 *
	 * @param diagnosis
	 *            an Diagnosis object is passed with the details to be updated.
	 *
	 * @return boolean a boolean value is returned whether the operation is
	 *         successful or not.
	 *
	 * @throws ApplicationException
	 *             An exception created for catching exceptions that occur while
	 *             updating an diagnosis.
	 */
	public boolean updateItem(Item item) throws ApplicationException;
	
	/**
	 * <p>
	 * This Method is used to obtain an arraylist of all the diagnosis that are
	 * currently present for a particular date
	 * </p>
	 *
	 * @return diagnosis an Arraylist consisting of all the diagnosis for a specific date is returned.
	 *
	 * @throws ApplicationException
	 *             An exception created for catching exceptions that occur while
	 *             displaying all diagnosis.
	 */

	public List<Item> fetchItemByName(String Name) throws ApplicationException;

	public Item searchItemById(int id) throws ApplicationException;
}
