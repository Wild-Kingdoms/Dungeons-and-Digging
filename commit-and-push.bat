@echo off
cls
git add -u
echo Added every file and folder, used .gitignore settings.
echo Ready to commit.
echo Git status:
git status
echo Write a small sentence about the changes made to the code after the last commit. You can close the console here to cancel
set -p commitMsg = ""
echo Commiting with the message you wrote above.
echo Close this window to cancel.
PAUSE
cls
git commit -m %COMMIT%
echo Commit done.
echo Push results:
git push origin master
echo Everything done. Exit.
PAUSE
cls

