package eu.crg.ega.swaggerconstants.submitter;

public class SwaggerSubmission {

  public static final String DESCRIPTION = "Operations related to a submission";

  public static final String SUBMISSION_STATUS = "Submission status";
  public static final String SUBMISSION_STATUS_DESCRIPTION = "";
  
  public static final String NEW_SUBMISSION = "New submission";
  public static final String NEW_SUBMISSION_NOTES = "Returns the Id for the new submission.";
  public static final String NEW_SUBMISSION_DATA = "Title (required) and description (not required) of the new submission";

  public static final String GET_SUBMISSION = "View submission";
  public static final String GET_SUBMISSION_NOTES = "Retrieves an existing submission by Id";
  public static final String GET_SUBMISSION_SUBMISSION_ID = "Submission Id";

  public static final String EDIT_SUBMISSION_NOTES = "";
  public static final String EDIT_SUBMISSION = "Edit an existing submission";
  public static final String EDIT_SUBMISSION_SUBMISSION_ID = "Submission Id";
  public static final String EDIT_SUBMISSION_DATA = "New values for title and description";
  public static final String EDIT_SUBMIT_ACTION = "Command action";
  public static final String EDIT_SUBSET_DATA = "To specify the subset of objects to submit. In this case, submitAction parameter must not be empty";
  
  public static final String DELETE_SUBMISSION_NOTES =
      "Deletes the submission provided. It must be in state DRAFT otherwise an exception will be thrown. It also deletes all metadata related to this submission that is not being used in any other submission.";
  public static final String DELETE_SUBMISSION = "Delete submission";
  public static final String DELETE_SUBMISSION_SUBMISSION_ID = "Submission Id";

  public static final String LIST = "List all submissions";
  public static final String LIST_NOTES = "";
  public static final String LIST_STATUS = "Status of the submissions";

}
