part of swagger.api;

class ContentAddBody {
  /* File to upload */
  String file = null;

  ContentAddBody();

  @override
  String toString() {
    return 'ContentAddBody[file=$file, ]';
  }

  ContentAddBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    file = json['file'];
  }

  Map<String, dynamic> toJson() {
    return {
      'file': file
     };
  }

  static List<ContentAddBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ContentAddBody>() : json.map((value) => new ContentAddBody.fromJson(value)).toList();
  }

  static Map<String, ContentAddBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ContentAddBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ContentAddBody.fromJson(value));
    }
    return map;
  }
}
