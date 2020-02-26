// package com.rms.model;



// /**
//  * some metadata
//  * 
//  * @autho jojo
//  */
// public class ResourceMetadata {
//     private int resourceCreator;
//     private String resourceCreationDate;
//     private String lastModifier;
//     private String lastModifiedDateTime;
//     private int resourceOwner;

//     public int getResourceCreator() {
//         return resourceCreator;
//     }

//     public void setResourceCreator(int resourceCreator) {
//         this.resourceCreator = resourceCreator;
//     }

//     public String getResourceCreationDate() {
//         return resourceCreationDate;
//     }

//     public void setResourceCreationDate(String resourceCreationDate) {
//         this.resourceCreationDate = resourceCreationDate;
//     }

//     public String getLastModifier() {
//         return lastModifier;
//     }

//     public void setLastModifier(String lastModifier) {
//         this.lastModifier = lastModifier;
//     }

//     public String getLastModifiedDateTime() {
//         return lastModifiedDateTime;
//     }

//     public void setLastModifiedDateTime(String lastModifiedDateTime) {
//         this.lastModifiedDateTime = lastModifiedDateTime;
//     }

//     public int getResourceOwner() {
//         return resourceOwner;
//     }

//     public void setResourceOwner(int resourceOwner) {
//         this.resourceOwner = resourceOwner;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((lastModifiedDateTime == null) ? 0 : lastModifiedDateTime.hashCode());
//         result = prime * result + ((lastModifier == null) ? 0 : lastModifier.hashCode());
//         result = prime * result + ((resourceCreationDate == null) ? 0 : resourceCreationDate.hashCode());
//         result = prime * result + resourceCreator;
//         result = prime * result + resourceOwner;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         ResourceMetadata other = (ResourceMetadata) obj;
//         if (lastModifiedDateTime == null) {
//             if (other.lastModifiedDateTime != null)
//                 return false;
//         } else if (!lastModifiedDateTime.equals(other.lastModifiedDateTime))
//             return false;
//         if (lastModifier == null) {
//             if (other.lastModifier != null)
//                 return false;
//         } else if (!lastModifier.equals(other.lastModifier))
//             return false;
//         if (resourceCreationDate == null) {
//             if (other.resourceCreationDate != null)
//                 return false;
//         } else if (!resourceCreationDate.equals(other.resourceCreationDate))
//             return false;
//         if (resourceCreator != other.resourceCreator)
//             return false;
//         if (resourceOwner != other.resourceOwner)
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "ResourceMetadata [lastModifiedDateTime=" + lastModifiedDateTime + ", lastModifier=" + lastModifier
//                 + ", resourceCreationDate=" + resourceCreationDate + ", resourceCreator=" + resourceCreator
//                 + ", resourceOwner=" + resourceOwner + "]";
//     }
// }