... It's a proof of concept to check its viability/ease of implementation using Java.
## Intro
This project uses [GraalVM native-image](https://www.graalvm.org/reference-manual/native-image/) to generate
a standalone executable (native image). The latest image for this project is found in `bin/` directory under
the name of `tota`

The goal of this POC is to implement a basic parser from a JSON to XML, the final intend is to use it to generate
an electronic invoice following DIAN Standard.
## Create Native Image
We use maven for the configuration of this project, there is a maven plugin configured to generate an image when
you run `mvn package` command.

Entry point of the app: `InvoiceApplication.java`
## Usage
```
./tota -h

Usage: Tota [-h] -i=<inputInvoice> [-o=<outputFile>]
Parse JSON file to an Electronic Invoice XML following DIAN's standard
  -h, --help   Print usage help and exit
  -i, --invoice=<inputInvoice>
               Input file path, should have file format at the end.
                 (path/invoice.json)
  -o, --output=<outputFile>
               Output file (path) + name (default: print to console)
```


## Example using testData

For this repo, a `tota --invoice testData/inputData.json` wil generate:

```
Result will be printed to console
<InvoiceControl>
  <invoiceAuthorization>18761112221</invoiceAuthorization>
  <authorizationPeriod>
    <endDate>2030-01-19</endDate>
    <startDate>2019-01-19</startDate>
  </authorizationPeriod>
  <authorizedInvoices>
    <prefix>SETP</prefix>
    <from>990000000</from>
    <to>995000000</to>
  </authorizedInvoices>
</InvoiceControl>
```

You can specify an output file name, and it will write the xml to it. 