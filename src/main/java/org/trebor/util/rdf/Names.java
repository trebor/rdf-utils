package org.trebor.util.rdf;

import java.util.ArrayList;
import java.util.List;

public class Names
{
  // name spaces
  
  public static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
  public static final String RDFS = "http://www.w3.org/2000/01/rdf-schema#";
  public static final String XSD = "http://www.w3.org/2001/XMLSchema#";

  // name collections
  
  public static final String[] NAMES = {RDF, RDFS, XSD};
  
  @SuppressWarnings("serial")
  public static final List<String> NAME_LIST = new ArrayList<String>()
  {
    {
      for (String name: NAMES)
        add(name);
    }
  };
}
