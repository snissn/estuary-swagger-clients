package io.swagger.api;

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class CollectionsApiControllerTest {

    @Inject
    private CollectionsApi api;

    @Test
    void collectionsColuuidCommitPostTest() {
        String coluuid = "coluuid_example";
        try {
            api.collectionsColuuidCommitPost(coluuid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidDeleteTest() {
        String coluuid = "coluuid_example";
        try {
            api.collectionsColuuidDelete(coluuid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidGetTest() {
        String coluuid = "coluuid_example";
        String dir = "dir_example";
        try {
            api.collectionsColuuidGet(coluuid, dir).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidPostTest() {
        List<Integer> body = Arrays.asList(56);
        try {
            api.collectionsColuuidPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsFsAddPostTest() {
        String coluuid = "coluuid_example";
        String content = "content_example";
        String path = "path_example";
        try {
            api.collectionsFsAddPost(coluuid, content, path).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsGetTest() {
        Integer id = 56;
        try {
            api.collectionsGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsPostTest() {
        MainCreateCollectionBody body = new MainCreateCollectionBody();
        try {
            api.collectionsPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
