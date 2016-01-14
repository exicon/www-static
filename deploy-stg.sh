#!/usr/bin/env bash

WWW_URL=https://www.stg.exicon.mobi \
  NODE_APPBOARD_URL=https://app.stg.exicon.mobi \
  boot build

aws s3 sync --exclude "*.DS_Store" target/public/ s3://stg.app-hq.com/
