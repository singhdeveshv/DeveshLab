/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.jmk.account.api;

import com.jmk.account.model.Expense;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-05T20:28:14.461+05:30")

@Api(value = "expense", description = "the expense API")
public interface ExpenseApi {

    @ApiOperation(value = "Save Expense Service", nickname = "saveExpense", notes = "Save Expense Service", response = Expense.class, tags={ "AccountMgmt", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Expense.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/expense",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Expense> saveExpense(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Expense body,@ApiParam(value = "" ) @RequestHeader(value="xChannel", required=false) String xChannel);

}
