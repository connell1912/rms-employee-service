// package com.rms.model;

// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import java.sql.Timestamp;

// import org.junit.Before;
// import org.junit.Test;
// import org.meanbean.test.BeanTester;
// import org.meanbean.test.Configuration;
// import org.meanbean.test.ConfigurationBuilder;    
    
// public class ResourceMetadataTest {

//     @Before
//     public void setup(){

//     }
        
//     @Test
//     public void testResourceMetadataBean() {
//         Configuration configuration = new ConfigurationBuilder()
//         .ignoreProperty("resourceCreationDate")  
//         .ignoreProperty("lastModifiedDateTime")
//         .ignoreProperty("resourceOwner")
//         .iterations(1)
//         .build();
//         new BeanTester().testBean(ResourceMetadata.class,configuration);
//         ResourceMetadata rm = new ResourceMetadata();
//         rm.setResourceCreationDate(new Timestamp(System.currentTimeMillis()));
//         rm.setLastModifiedDateTime(new Timestamp(System.currentTimeMillis()));
//         rm.canEqual(new ResourceMetadata());
//         assertFalse(rm.canEqual(null));
//         assertTrue(rm.canEqual(rm));
//         assertFalse(rm.equals(null));
//         assertTrue(rm.equals(rm));
//         rm.equals(rm);
//         ResourceMetadata r2 = new ResourceMetadata(1, 2, null, 34, null,null);
//         rm.equals(new ResourceMetadata());
//         rm.hashCode();
//         assertNotNull(new Employee("firstName", "lastName", "email", "password", Department.TRAINING, Title.HR_LEAD));
//         assertNotNull(new Employee("firstName", "lastName", "email", "password", Department.HR, Title.TRAINING_LEAD, null));
//     }
// }
    