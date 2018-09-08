#!/bin/bash
# see https://github.com/travis-ci/travis-ci/issues/6301
set -e
MODIFIED_FILES=$(git diff --name-only $TRAVIS_COMMIT_RANGE)
if ! echo ${MODIFIED_FILES} | grep -qvE '(\.md$)|(^examples)/'; then
  echo "Only docs were updated, stopping build process."
  travis_terminate 0
  exit 1
fi
echo "BUILDING"
exit
