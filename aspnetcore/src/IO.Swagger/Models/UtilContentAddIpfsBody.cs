/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class UtilContentAddIpfsBody : IEquatable<UtilContentAddIpfsBody>
    { 
        /// <summary>
        /// Gets or Sets Coluuid
        /// </summary>

        [DataMember(Name="coluuid")]
        public string Coluuid { get; set; }

        /// <summary>
        /// Gets or Sets Dir
        /// </summary>

        [DataMember(Name="dir")]
        public string Dir { get; set; }

        /// <summary>
        /// Gets or Sets Filename
        /// </summary>

        [DataMember(Name="filename")]
        public string Filename { get; set; }

        /// <summary>
        /// Gets or Sets Peers
        /// </summary>

        [DataMember(Name="peers")]
        public List<string> Peers { get; set; }

        /// <summary>
        /// Gets or Sets Root
        /// </summary>

        [DataMember(Name="root")]
        public string Root { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UtilContentAddIpfsBody {\n");
            sb.Append("  Coluuid: ").Append(Coluuid).Append("\n");
            sb.Append("  Dir: ").Append(Dir).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Peers: ").Append(Peers).Append("\n");
            sb.Append("  Root: ").Append(Root).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((UtilContentAddIpfsBody)obj);
        }

        /// <summary>
        /// Returns true if UtilContentAddIpfsBody instances are equal
        /// </summary>
        /// <param name="other">Instance of UtilContentAddIpfsBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UtilContentAddIpfsBody other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Coluuid == other.Coluuid ||
                    Coluuid != null &&
                    Coluuid.Equals(other.Coluuid)
                ) && 
                (
                    Dir == other.Dir ||
                    Dir != null &&
                    Dir.Equals(other.Dir)
                ) && 
                (
                    Filename == other.Filename ||
                    Filename != null &&
                    Filename.Equals(other.Filename)
                ) && 
                (
                    Peers == other.Peers ||
                    Peers != null &&
                    Peers.SequenceEqual(other.Peers)
                ) && 
                (
                    Root == other.Root ||
                    Root != null &&
                    Root.Equals(other.Root)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Coluuid != null)
                    hashCode = hashCode * 59 + Coluuid.GetHashCode();
                    if (Dir != null)
                    hashCode = hashCode * 59 + Dir.GetHashCode();
                    if (Filename != null)
                    hashCode = hashCode * 59 + Filename.GetHashCode();
                    if (Peers != null)
                    hashCode = hashCode * 59 + Peers.GetHashCode();
                    if (Root != null)
                    hashCode = hashCode * 59 + Root.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UtilContentAddIpfsBody left, UtilContentAddIpfsBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UtilContentAddIpfsBody left, UtilContentAddIpfsBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
