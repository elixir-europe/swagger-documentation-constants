package eu.crg.ega.swaggerconstants.request;

public class SwaggerRequest {
  
  public static final String DESCRIPTION = "Operations over requests";

  public static final String GET_REQUEST = "Get a request";
  public static final String GET_REQUEST_NOTES = "Retrieves the request and shows its data";
  public static final String GET_REQUEST_REQUEST_ID = "The ID of the request to be viewed";
  
  public static final String NEW_REQUEST = "New request";
  public static final String NEW_REQUEST_NOTES = "Inserts a new request in the system";
  public static final String NEW_REQUEST_REQUEST_DATA = "The data for filling the request";
  
  public static final String EDIT_REQUEST = "Edit a request"; 
  public static final String EDIT_REQUEST_NOTES = "Edits an existing request. This request must be in DRAFT status.";
  public static final String EDIT_REQUEST_REQUEST_ID = "The ID of the request to be viewed";
  public static final String EDIT_REQUEST_REQUEST_DATA = "The data for filling the request";

  public static final String DELETE_REQUEST = "Delete a request";
  public static final String DELETE_REQUEST_NOTES = "Deletes an existing request. This request must be in DRAFT status.";
  public static final String DELETE_REQUEST_REQUEST_ID = "The ID of the request to be viewed";
  
  public static final String CHECK_ELIGIBLE_PACKETS = "Packets already in a request";
  public static final String CHECK_ELIGIBLE_PACKETS_NOTES = "Determines if these packets have already been requested before. NOT IMPLEMENTED YET."; 
  public static final String CHECK_ELIGIBLE_PACKETS_PACKETS_LIST = "List of packets";

}
