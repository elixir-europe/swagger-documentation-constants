package eu.crg.ega.swaggerconstants.common;

public class SwaggerCommon {
  
  public static final String COOKIE_PARAM = "The cookie containing the session Id of the user";
  public static final String QUERY_PARAMS = "Additional data like parameters for pagination (skip and limit). Must be specified as query parameters (for example, skip=0&limit=5). If you want to retrieve ALL data set both skip and limit parameters to 0.";
  public static final String AUTH_HEADER = "The Authorization header containing the session Id of the user (e. g., Authorization: Bearer 3)";
  public static final String SORT = "A collection of sort directives in the format ($propertyname,)+[asc|desc]?";
  
}
