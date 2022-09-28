for lang in $(cat supported_langs); do
  swagger-codegen generate \
    -i https://raw.githubusercontent.com/application-research/estuary/master/docs/swagger.json \
    -l $lang \
    -o $lang

done
