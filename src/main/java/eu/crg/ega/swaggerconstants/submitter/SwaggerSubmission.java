package eu.crg.ega.swaggerconstants.submitter;

public class SwaggerSubmission {

  public static final String DESCRIPTION = "Operations related to a submission";
  
  public static final String LIST_LIBRARY_STRATEGY = "Library Strategy accepted values";
  public static final String LIST_LIBRARY_STRATEGY_NOTES = "Valid values for the Experiment XML field called LIBRARY_STRATEGY.";
  
  public static final String LIST_LIBRARY_SELECTION = "Library Selection accepted values";
  public static final String LIST_LIBRARY_SELECTION_NOTES = "Valid values for the Experiment XML field called LIBRARY_SELECTION.";
  
  public static final String LIST_LIBRARY_SOURCE = "Library source accepted values";
  public static final String LIST_LIBRARY_SOURCE_NOTES = "Valid values for the Experiment XML field called LIBRARY_SOURCE.";
  
  public static final String LIST_INSTRUMENT_MODEL = "Platform accepted values";
  public static final String LIST_INSTRUMENT_MODEL_NOTES = "Valid values for the Experiment XML field called PLATFORM.";

  public static final String LIST_DATASET_TYPE = "Dataset type accepted values";
  public static final String LIST_DATASET_TYPE_NOTES = "Valid values for the Dataset XML field DATASET_TYPE.";
  
  public static final String SUBMISSION_STATUS = "Submission status";
  public static final String SUBMISSION_STATUS_DESCRIPTION = "";

  public static final String LIST_STUDY_TYPE_NOTES = "Study type accepted values";
  public static final String LIST_STUDY_TYPE = "Valid values for the Study XML field STUDY_TYPE.";

  public static final String STUDY = "Submit a new study";
  public static final String STUDY_NOTES = "";
  public static final String STUDY_DATA = "";

  public static final String LIST_STUDIES = "List studies";
  public static final String LIST_STUDIES_NOTES = "List all studies uploaded by the user logged in.";
  
  public static final String NEW_SUBMISSION = "New submission";
  public static final String NEW_SUBMISSION_NOTES = "Returns the Id for the new submission.";
  public static final String NEW_SUBMISSION_DESCRIPTION = "";

  public static final String GET_SUBMISSION = "View submission";
  public static final String GET_SUBMISSION_NOTES = "Retrieves an existing submission by Id";
  public static final String GET_SUBMISSION_SUBMISSION_ID = "Submission Id";

  public static final String EDIT_SUBMISSION_NOTES = "Edits the submission provided. It must be in state DRAFT otherwise and exception will be thrown.";
  public static final String EDIT_SUBMISSION = "Edit an existing submission";
  public static final String EDIT_SUBMISSION_SUBMISSION_ID = "Submission Id";
  public static final String EDIT_SUBMISSION_DESCRIPTION = "";

  public static final String DELETE_SUBMISSION_NOTES =
      "Deletes the submission provided. It must be in state DRAFT otherwise an exception will be thrown. It also deletes all metadata related to this submission that is not being used in any other submission.";
  public static final String DELETE_SUBMISSION = "Delete submission";
  public static final String DELETE_SUBMISSION_SUBMISSION_ID = "Submission Id";

}
