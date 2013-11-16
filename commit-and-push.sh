#!/bin/sh
git add -u
echo Added every file and folder, used .gitignore settings.
echo Ready to commit.
echo Git status:
git status
echo Write a small sentence about the changes made to the code after the last commit. You can close the console here to cancel
read COMMIT
echo Commiting with:
echo $COMMIT
echo You can close the console here to cancel
read end
git commit -m "$COMMIT"
echo Commit done.
echo Push results:
git push origin master
echo Press enter to exit;
read end
