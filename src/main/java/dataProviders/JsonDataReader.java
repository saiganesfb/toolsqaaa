/*
 * package dataProviders; import java.io.BufferedReader; import
 * java.io.FileNotFoundException; import java.io.FileReader; import
 * java.io.IOException; import java.util.Arrays; import java.util.List; import
 * com.google.gson.Gson; import managers.FileReaderManager; import
 * testDataTypes.Customer;
 * 
 * public class JsonDataReader { private final String customerFilePath =
 * FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() +
 * "Customer.json"; private List<Customer> customerList;
 * 
 * public JsonDataReader(){ customerList = getCustomerData(); }
 * 
 * private List<Customer> getCustomerData() { Gson gson = new Gson();
 * BufferedReader bufferReader = null; try { bufferReader = new
 * BufferedReader(new FileReader(customerFilePath)); Customer[] Customer =
 * gson.fromJson(bufferReader, Customer[].class); return
 * Arrays.asList(Customer); }catch(FileNotFoundException e) { throw new
 * RuntimeException("Json file not found at path : " + customerFilePath);
 * }finally { try { if(bufferReader != null) bufferReader.close();} catch
 * (IOException ignore) {} } }
 * 
 * 
 * public final Customer getCustomerByFirstName(String customerFirstName){
 * return customerList.stream().filter(x ->
 * x.firstName.equalsIgnoreCase(customerFirstName)).findAny().get(); }
 * 
 * public final Customer getCustomerByFirstName(String customerName){
 * for(Customer customer : customerList) {
 * if(customer.firstName.equalsIgnoreCase(customerName)) return customer; }
 * return null; }
 * 
 * }
 */