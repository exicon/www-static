#!/usr/bin/env bash
begin
  set -lx WWW_URL https://www.stg.exicon.mobi
  set -lx NODE_APPBOARD_URL https://app.stg.exicon.mobi
  boot build
end
aws s3 sync --exclude "*.DS_Store" target/public/ s3://stg.app-hq.com/