/*
 * This file is part of HuskChat, licensed under the Apache License 2.0.
 *
 *  Copyright (c) William278 <will27528@gmail.com>
 *  Copyright (c) contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.william278.huskchat.placeholderparser;

import net.william278.huskchat.player.Player;
import net.william278.papiproxybridge.api.PlaceholderAPI;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class PAPIProxyBridgeParser implements Placeholders {
    @Override
    public CompletableFuture<String> parsePlaceholders(String stringToParse, Player player) {
        final PlaceholderAPI api = PlaceholderAPI.getInstance();
        final UUID uuid = player.getUuid();
        return api.formatPlaceholders(stringToParse, uuid).toCompletableFuture();
    }
}
