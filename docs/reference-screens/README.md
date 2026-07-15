# Reference Screens — original app screenshots

Drop screenshots of the **original app** into this folder. They are the ground truth
we rebuild the UI against (layout, spacing, colors, copy, icons, states).

## How to add them

1. Save each screenshot into the matching subfolder below (create one if it's missing).
2. Name files so the order/flow is obvious, e.g.:
   - `01-launch-splash.png`
   - `02-login-pin.png`
   - `03-home-top.png`
   - `04-home-scrolled.png`
3. If a screen has multiple states (empty / loading / error / success), add the state
   to the name: `send-money-confirm-success.png`.

> Tip: don't worry about perfect names — even raw dumps help. I'll rename/organize.

## Suggested folders (based on recovered config)

Bottom navigation is **Home / Life / My** (`home_navigation_default_config.json`).

| Folder | What to capture |
|--------|-----------------|
| `00-onboarding/` | Splash, permissions, first-run, language pick |
| `01-login/` | PIN, OTP, fingerprint/FaceID prompts, errors |
| `02-home/` | Home tab top + scrolled, quick actions, balance card |
| `03-send-money/` | P2P transfer form → confirm → PIN → success/receipt |
| `04-pay/` | Pay Bill / Buy Goods / scan-to-pay flows |
| `05-airtime/` | Airtime recharge form + confirm + receipt |
| `06-life/` | Life tab (mini-programs / services grid) |
| `07-my/` | My/profile tab, settings, statements, limits |
| `08-misc/` | Notifications, dialogs, toasts, anything else |

## What's most useful

- **Full screens** (top and after scrolling) rather than crops.
- Both **light and dark** mode if the app has them (it ships a dark theme).
- The **transition/confirm** screens, not just the main one — those carry the exact copy.

Ready when you are — just add the images here and tell me which flow to start on.

