#!/usr/bin/env bash

WWW_URL=https://www.stg.exicon.mobi \
  NODE_APPBOARD_URL=https://app.stg.exicon.mobi \
  boot build

# only updates www-static files, to also include old homepage updates
# or to delete previous files that are not required anymore
# use the script from infrastructure repo
aws s3 sync --exclude "*.DS_Store" target/public/ s3://stg.exicon.mobi/