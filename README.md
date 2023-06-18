<!--suppress ALL -->
<p align="center">
    <img src="images/banner.png" alt="HuskChat" />
    <a href="https://github.com/WiIIiam278/HuskChat/actions/workflows/ci.yml">
        <img src="https://img.shields.io/github/actions/workflow/status/WiIIiam278/HuskChat/ci.yml?branch=master&logo=github"/>
    </a> 
    <a href="https://jitpack.io/#net.william278/HuskChat">
        <img src="https://img.shields.io/jitpack/version/net.william278/HuskChat?color=%2300fb9a&label=api&logo=gradle" />
    </a> 
    <a href="https://discord.gg/tVYhJfyDWG">
        <img src="https://img.shields.io/discord/818135932103557162.svg?label=&logo=discord&logoColor=fff&color=7389D8&labelColor=6A7EC2" />
    </a> 
    <br/>
    <b>
        <a href="https://www.spigotmc.org/resources/huskchat.94496/">Spigot</a>
    </b> —
    <b>
        <a href="https://william278.net/docs/huskchat/setup">Setup</a>
    </b> — 
    <b>
        <a href="https://william278.net/docs/huskchat/">Docs</a>
    </b> — 
    <b>
        <a href="https://github.com/WiIIiam278/HuskChat/issues">Issues</a>
    </b>
</p>
<br/>

**HuskChat** is a no-frills, simple and customisable cross-server chat system for Minecraft networks running BungeeCord and Velocity frontend servers.

It's designed to be easy to configure with an elegant out-of-box setup, while also being highly configurable, suiting a variety of use cases by allowing you to define channels and manage who can send and receive messages within them.

> ⚠️ _Velocity 1.19 users: Please [see here](https://github.com/WiIIiam278/HuskChat/issues/72) for how to fix players getting kicked for message signing issues!_

## Features
**⭐ Use PlaceholderAPI** &mdash; Use more than 500+ Placeholders from [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) using [PAPIProxyBridge](https://www.spigotmc.org/resources/papiproxybridge.108415/)

**⭐ Works great out of the box** &mdash; Install on your Velocity or BungeeCord-based proxy and use right away

**⭐ Display user roles** &mdash; Hooks with LuckPerms to display user prefixes and suffixes

**⭐ Private messaging** &mdash; Private messages&mdash;including group DMs&mdash and replying, admin spy features

**⭐ Fine-tune channels** &mdash; Set channel send/receive permissions, send to a discord webhook, filter [& more](https://william278.net/docs/huskchat/channels)!

**⭐ Quick and easy to use** &mdash; Super simple set of [commands](https://william278.net/docs/huskchat/commands). Define channel shortcut commands, too!

**⭐ Advanced profanity checking** &mdash;  Machine learning powered profanity filter

**⭐ Filters & replacers** &mdash; Customisable spam limiting filter, anti-advertising & special emoji

**⭐ Modern formatting** &mdash;  Utilise modern 1.16+ formatting, with RGB and Gradient support via [MineDown](https://github.com/Phoenix616/MineDown)

## Building
To build HuskChat, you'll need python (>=`v3.6`) with associated packages installed; `jep` and `alt-profanity-check`. 
You can install these with `pip install jep` and `pip install alt-profanity-check`. These are needed to run the profanity filter tests.

Then, simply run the following in the root of the repository:
```
./gradlew clean build
```

## License
HuskChat is licensed under the Apache 2.0 license.

- [License](https://github.com/WiIIiam278/HuskChat/blob/master/LICENSE)

## Translations
Translations of the plugin locales are welcome to help make the plugin more accessible. Please submit a pull request with your translations as a `.yml` file.

- [Locales Directory](https://github.com/WiIIiam278/HuskChat/tree/master/common/src/main/resources/languages)
- [English Locales](https://github.com/WiIIiam278/HuskChat/tree/master/common/src/main/resources/languages/en-gb.yml)

## Links
- [Docs](https://william278.net/docs/huskchat/) &mdash; Read the plugin documentation!
- [Spigot](https://www.spigotmc.org/resources/huskchat.94496/) &mdash; View the Spigot resource page (Also: [Polymart](https://polymart.org/resource/huskchat.1217), [Modrinth](https://modrinth.com/plugin/huskchat))
- [Issues](https://github.com/WiIIiam278/HuskChat/issues) &mdash; File a bug report or feature request
- [Discord](https://discord.gg/tVYhJfyDWG) &mdash; Get help, ask questions
- [bStats](https://bstats.org/plugin/bungeecord/HuskChat/11882) &mdash; View plugin metrics (Also: [Velocity](https://bstats.org/plugin/velocity/HuskChat%20-%20Velocity/14187))

---
&copy; [William278](https://william278.net/), 2023. Licensed under the Apache-2.0 License.
