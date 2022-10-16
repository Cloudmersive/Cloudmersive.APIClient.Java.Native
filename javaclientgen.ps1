Remove-Item –path ./docs –recurse
Remove-Item –path ./gradle –recurse
Remove-Item –path ./scripts –recurse
Remove-Item –path ./src –recurse
$artifact_version = "4.2.2"
& java -jar openapi-generator-cli-6.0.0.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -g java -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/nlp-v2/docs/v1/swagger  -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/config/docs/v1/swagger -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/video/docs/v1/swagger -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/swagger/api/dataintegration -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/swagger/api/currency -g java  -c packageconfig.json         -o . --skip-validate-spec
& java -jar openapi-generator-cli-6.0.0.jar generate    -i https://api.cloudmersive.com/swagger/api/security -g java  -c packageconfig.json         -o . --skip-validate-spec

(Get-Content ./build.gradle).replace('src/main\java', "src/main/java") | Set-Content ./build.gradle

#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
& gradle build
#& popd