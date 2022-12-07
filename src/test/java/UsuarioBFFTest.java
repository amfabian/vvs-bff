import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
class UsuarioBFFTest {

    @Test
    @DisplayName("Teste User BFF")
    @Order(1)
    void testHome() {

        given()
            .when().get("")
            .then()
            .statusCode(200);

    }

   
    
}
