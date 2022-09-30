--  Estuary API
--  This is the API for the Estuary application.
--
--  OpenAPI spec version: 0.0.0
--  
--
--  NOTE: This package is auto generated by the swagger code generator 2.4.28.
--  https://github.com/swagger-api/swagger-codegen.git
--  Do not edit the class manually.

package body .Models is

   use Swagger.Streams;



   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_HttpError_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("code", Value.Code);
      Into.Write_Entity ("details", Value.Details);
      Into.Write_Entity ("reason", Value.Reason);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_HttpError_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_HttpError_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "code", Value.Code);
      Swagger.Streams.Deserialize (Object, "details", Value.Details);
      Swagger.Streams.Deserialize (Object, "reason", Value.Reason);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_HttpError_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Util_HttpError_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_ContentAddIpfsBody_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("coluuid", Value.Coluuid);
      Into.Write_Entity ("dir", Value.Dir);
      Into.Write_Entity ("filename", Value.Filename);
      Serialize (Into, "peers", Value.Peers);
      Into.Write_Entity ("root", Value.Root);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_ContentAddIpfsBody_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_ContentAddIpfsBody_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "coluuid", Value.Coluuid);
      Swagger.Streams.Deserialize (Object, "dir", Value.Dir);
      Swagger.Streams.Deserialize (Object, "filename", Value.Filename);
      Swagger.Streams.Deserialize (Object, "peers", Value.Peers);
      Swagger.Streams.Deserialize (Object, "root", Value.Root);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_ContentAddIpfsBody_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Util_ContentAddIpfsBody_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_importDealBody_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("coluuid", Value.Coluuid);
      Into.Write_Entity ("dealIDs", Value.Deal_I_Ds);
      Serialize (Into, "dealIDs", Value.Deal_I_Ds);
      Into.Write_Entity ("dir", Value.Dir);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_importDealBody_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_importDealBody_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "coluuid", Value.Coluuid);
      Swagger.Streams.Deserialize (Object, "dealIDs", Value.Deal_I_Ds);
      Swagger.Streams.Deserialize (Object, "dir", Value.Dir);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_importDealBody_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Main_importDealBody_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_estimateDealBody_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("durationBlks", Value.Duration_Blks);
      Into.Write_Entity ("replication", Value.Replication);
      Into.Write_Entity ("size", Value.Size);
      Into.Write_Entity ("verified", Value.Verified);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_estimateDealBody_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_estimateDealBody_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "durationBlks", Value.Duration_Blks);
      Swagger.Streams.Deserialize (Object, "replication", Value.Replication);
      Swagger.Streams.Deserialize (Object, "size", Value.Size);
      Swagger.Streams.Deserialize (Object, "verified", Value.Verified);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_estimateDealBody_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Main_estimateDealBody_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Collections_Collection_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("cid", Value.Cid);
      Into.Write_Entity ("createdAt", Value.Created_At);
      Into.Write_Entity ("description", Value.Description);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("userId", Value.User_Id);
      Into.Write_Entity ("uuid", Value.Uuid);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Collections_Collection_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Collections_Collection_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "cid", Value.Cid);
      Swagger.Streams.Deserialize (Object, "createdAt", Value.Created_At);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "userId", Value.User_Id);
      Swagger.Streams.Deserialize (Object, "uuid", Value.Uuid);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Collections_Collection_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Collections_Collection_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_createCollectionBody_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("description", Value.Description);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_createCollectionBody_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_createCollectionBody_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_createCollectionBody_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Main_createCollectionBody_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_getApiKeysResp_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("expiry", Value.Expiry);
      Into.Write_Entity ("token", Value.Token);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_getApiKeysResp_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_getApiKeysResp_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "expiry", Value.Expiry);
      Swagger.Streams.Deserialize (Object, "token", Value.Token);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_getApiKeysResp_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Main_getApiKeysResp_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_userStatsResponse_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("numPins", Value.Num_Pins);
      Into.Write_Entity ("totalSize", Value.Total_Size);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Main_userStatsResponse_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_userStatsResponse_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "numPins", Value.Num_Pins);
      Swagger.Streams.Deserialize (Object, "totalSize", Value.Total_Size);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Main_userStatsResponse_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Main_userStatsResponse_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_ContentAddResponse_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("cid", Value.Cid);
      Into.Write_Entity ("estuaryId", Value.Estuary_Id);
      Serialize (Into, "providers", Value.Providers);
      Into.Write_Entity ("retrieval_url", Value.Retrieval_Url);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Util_ContentAddResponse_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_ContentAddResponse_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "cid", Value.Cid);
      Swagger.Streams.Deserialize (Object, "estuaryId", Value.Estuary_Id);
      Swagger.Streams.Deserialize (Object, "providers", Value.Providers);
      Swagger.Streams.Deserialize (Object, "retrieval_url", Value.Retrieval_Url);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Util_ContentAddResponse_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Util_ContentAddResponse_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;



end .Models;
