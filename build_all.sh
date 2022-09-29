

#set cmd to be swagger-codegen if that doesnt exist make it the java command
#swagger-codegen is supported by brew install swagger-codegen
#the java command is supported by the docker image swaggerapi/swagger-codegen-cli

cmd="swagger-codegen"
$cmd || cmd="java -jar /opt/swagger-codegen-cli/swagger-codegen-cli.jar"

for lang in $(cat supported_langs); do
  $cmd generate \
    -i https://raw.githubusercontent.com/application-research/estuary/master/docs/swagger.json \
    -l $lang \
    -o $lang

done
