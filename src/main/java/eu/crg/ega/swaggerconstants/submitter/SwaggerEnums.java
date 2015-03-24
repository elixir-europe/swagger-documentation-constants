package eu.crg.ega.swaggerconstants.submitter;

public class SwaggerEnums {

  public static final String DESCRIPTION = "Lists enumerations available";
 
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
  
  public static final String LIST_STUDY_TYPE = "Study type accepted values";
  public static final String LIST_STUDY_TYPE_NOTES = "Valid values for the Study XML field STUDY_TYPE.";

  public static final String LIST_FILE_TYPE_NOTES = "";
  public static final String LIST_FILE_TYPE = "Run file type accepted values";

  public static final String LIST_CASE_CONTROL = "Case/control accepted values";
  public static final String LIST_CASE_CONTROL_NOTES = "Valid values for case/control field in sample form";

  public static final String LIST_GENDER = "Gender accepted values ";
  public static final String LIST_GENDER_NOTES = "Valid values for gender field in sample form";

  public static final String LIST_GENOMES = "Genome values";
  public static final String LIST_GENOMES_NOTES = "Used in analysis (BAM and VCF types)";

  public static final String LIST_EXPERIMENT_TYPES = "Experiment types";
  public static final String LIST_EXPERIMENT_TYPES_NOTES = "Used in analysis (VCF type)";

  public static final String LIST_ANALYSIS_TYPES = "EGA elegible analysis types";
  public static final String LIST_ANALYSIS_TYPES_NOTES = "Valid values for analysis type";

  public static final String LIST_CHROMOSOMES = "Chromosome values";
  public static final String LIST_CHROMOSOMES_NOTES = "Used in analysis (VCF type)";

  public static final String LIST_ACTIONS = "Action values";
  public static final String LIST_ACTIONS_NOTES = "Required when performing a PUT operation over a resource (submission, analysis, DAC, sample, etc.)";

  public static final String LIST_STATUSES = "Status values";
  public static final String LIST_STATUSES_NOTES = "Required when listing submissions or components (analyses, DACs, samples, etc.).";
  
}
