# Project 3 - *ParstaGram*

**ParstaGram** is a photo sharing app using Parse as its backend.

Time spent: **28** hours spent in total

## User Stories

The following **required** functionality is completed:

- [ *] User sees app icon in home screen.
- [* ] User can sign up to create a new account using Parse authentication
- [* ] User can log in to their account
- [ *] The current signed in user is persisted across app restarts
- [* ] User can log out of their account
- [ *] User can take a photo, add a caption, and post it to "Instagram"
- [ *] User can view the last 20 posts submitted to "Instagram"
- [ *] User can pull to refresh the last 20 posts submitted to "Instagram"
- [ *] User can tap a post to go to a Post Details activity, which includes timestamp and caption.

The following **stretch** features are implemented:

- [ ] Style the login page to look like the real Instagram login page.
- [ ] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once they reach the bottom of the feed using endless scrolling.
- [ ] User should switch between different tabs using fragments and a Bottom Navigation View.
  - [ ] Feed Tab (to view all posts from all users)
  - [ ] Capture Tab (to make a new post using the Camera and Photo Gallery)
  - [ ] Profile Tab (to view only the current user's posts, in a grid)
- [ ] Show the username and creation time for each post
- User Profiles:
  - [ ] Allow the logged in user to add a profile photo
  - [ ] Display the profile photo with each post
  - [ ] Tapping on a post's username or profile photo goes to that user's profile page
  - [ ] User Profile shows posts in a grid
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

Display image directly in markdown:

![](https://github.com/shaniyaclement/FBU-Parstagram/raw/master/Parsta.gif)

or use a custom width for the image by switching to HTML:

<img src="https://github.com/shaniyaclement/FBU-Parstagram/raw/master/Parsta.gif" width="250" />

GIF created with [Kap](https://getkap.co/).

## Credits

List an 3rd party libraries, icons, graphics, or other assets you used in your app.

- [Android Async Http Client](http://loopj.com/android-async-http/) - networking library
- [Back4App] (https://parse-dashboard.back4app.com/apps/bf2ce9f3-bcd4-46d6-8c4e-344b6c420582/browser/_User) - Parse Database


## Notes

During Step 5 I encountered an issue with connecting my Parse Database with the Android Studio project. I couldn't move forward with the next steps until this one was fixed. The code was correct; however, the Parse Database wwas not communicating the information with the app. I asked for assitance and the instructors even struggled for hours until we decided to just delete the classes and restart. It magially started to work after that.
## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
