note
 description:"[
		Estuary API
 		This is the API for the Estuary application.
  		OpenAPI spec version: 0.0.0
 	    

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"
class UTIL_HTTP_ERROR 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    code: INTEGER_32 
      
    details: detachable STRING_32 
      
    reason: detachable STRING_32 
      

feature -- Change Element  
 
    set_code (a_name: like code)
        -- Set 'code' with 'a_name'.
      do
        code := a_name
      ensure
        code_set: code = a_name		
      end

    set_details (a_name: like details)
        -- Set 'details' with 'a_name'.
      do
        details := a_name
      ensure
        details_set: details = a_name		
      end

    set_reason (a_name: like reason)
        -- Set 'reason' with 'a_name'.
      do
        reason := a_name
      ensure
        reason_set: reason = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UTIL_HTTP_ERROR%N")
        if attached code as l_code then
          Result.append ("%Ncode:")
          Result.append (l_code.out)
          Result.append ("%N")    
        end  
        if attached details as l_details then
          Result.append ("%Ndetails:")
          Result.append (l_details.out)
          Result.append ("%N")    
        end  
        if attached reason as l_reason then
          Result.append ("%Nreason:")
          Result.append (l_reason.out)
          Result.append ("%N")    
        end  
      end
end


